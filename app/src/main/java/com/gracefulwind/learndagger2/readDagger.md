
###3.优先级  
  @Provides的优先级高于@Inject  
  Component的Build里的Build和@Provides同时设置的话，dagger会不知道通过哪个构造，只能2选1  
  一个类中Inject方法只能注解一个方法  
  build里传入的参数和module中需要用到的参数必须一样，不能有继承情况，必须完全对应  
  同一个class的2个不同入参@Provides似乎也不行？还是因为2条路都能走通所以不行？(已测试，是有2个就不行，就算入参完全不冲突)(要多个似乎只有添加Named)  
  
###2.入参及其他  
    Component中的inject必须用我们的view实例类，不能用抽象接口  
    @ActivityScope只对相对应provides产生的presenter有效，对inject，Named均无效  
      
###1.Main这段：  
    就是完成了下dagger，回头总结下
      
    
###4.打算试下bind以及别的注解  
    自定义注解符:  
    @Qualifier
    public @interface QualifierEngineA {}
    
    @Qualifier
    public @interface QualifierEngineB {}
    类似@ActivityScope的写法，替代Named的效果  
    {
        
        -------------------------------------------------------------------------------------------
        我们定义两个Engine类的修饰：
        @Qualifier
        public @interface QualifierEngineA {}
        @Qualifier
        public @interface QualifierEngineB {}
        
        -------------------------------------------------------------------------------------------
        然后在EngineModule里根据类型，返回不同气缸数目的Engine对象:
        @Module
        public class CarModule {
        
            @Provides
            @QualifierCarA
            Car provideCarA(@QualifierEngineA Engine engine){
                return new Car(engine);
            }
        
            @Provides
            @QualifierCarB
            Car provideCarB(@QualifierEngineB Engine engine){
                return new Car(engine);
            }
        }
        
        -------------------------------------------------------------------------------------------
        在EngineComponent中同样要使用修饰来声明返回类型:
        Module(subcomponents = CarComponent.class)
        public class EngineModule {
        
            @Provides
            @QualifierEngineA
            Engine provideEngineA(){
                return new Engine(3);
            }
        
            @Provides
            @QualifierEngineB
            Engine provideEngineB(){
                return new Engine(5);
            }
        
        }
        
        -------------------------------------------------------------------------------------------
        为了使用不同的Engine，我们再使用同样的方法定义两个Car的修饰：
        @Qualifier
        public @interface QualifierCarA {}
        
        @Qualifier
        public @interface QualifierCarB {}
        
        -------------------------------------------------------------------------------------------
        然后我们同样在CarModule里声明不同修饰类型使用不同的引擎类型:
        @Module
        public class CarModule {
        
            @Provides
            @QualifierCarA
            Car provideCarA(@QualifierEngineA Engine engine){
                return new Car(engine);
            }
        
            @Provides
            @QualifierCarB
            Car provideCarB(@QualifierEngineB Engine engine){
                return new Car(engine);
            }
        }
        
        -------------------------------------------------------------------------------------------
        注意，我们这里通过Engine参数的修饰类型，让CarA对应EngineA,CarB对应EngineB。接下来在CarComponent中声明两种修饰类型:
        @Subcomponent(modules = CarModule.class)
        public interface CarComponent {
        
            @QualifierCarA
            Car getCarA();
        
            @QualifierCarB
            Car getCarB();
        
            @Subcomponent.Builder
            interface Builder{
        
                Builder carModule(CarModule module);
        
                CarComponent build();
        
            }
        }
        
        -------------------------------------------------------------------------------------------
        Main方法里，我们创建两个不同类型的Car查看他们的气缸数目:
        public class Main {
            public static void main(String[] args) {
                CarComponent carComponent = DaggerEngineComponent.builder()
                        .engineModule(new EngineModule())
                        .build()
                        .carComponent()
                        .carModule(new CarModule())
                        .build();
        
                Car carA = carComponent.getCarA();
                Car carB = carComponent.getCarB();
                System.out.println("carA cylinderNumbers : " + carA.getEngine().getCylinderNumbers());
                System.out.println("carB cylinderNumbers : " + carB.getEngine().getCylinderNumbers());
            }
        }
        
        -------------------------------------------------------------------------------------------
        完成
    }
    
     
    
        
public class FactoryAnimal {
    public Animal getAnimal(String type){
        if ("cannie".equals(type)){
            return new Dog();
        }
        else {
            return new Cat();
        }
    }
}

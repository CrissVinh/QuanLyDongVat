package QuanLyDongVat;

public class Processor {

    public static void main(String[] args) {
        Dog dog1 = new Dog("002  ", "beta  ", " 02/01/2000  ", "blue  ", "husky");
        Dog dog2 = new Dog("003  ", "gama  ", " 03/01/2000  ", "orange  ", "PhuQuoc");
        Cat cat1 = new Cat("004  ", "deka  ", "04/01/2000  ", "pink  ", " blacKEye   ");
        Cat cat2 = new Cat("005  ", "haha  ", "05/01/2000  ", "violet  ", "broundEye  ");

        AnimalList animalList = new AnimalList();
        animalList.addAnimal(dog1);
        animalList.addAnimal(dog2);
        animalList.addAnimal(cat1);
        animalList.addAnimal(cat2);

        animalList.displayAll();
    }

}

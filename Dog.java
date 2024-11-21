
package QuanLyDongVat;

public class Dog extends Animal{
    private String loaiDog;
    public Dog(String id, String source, String dateOfBirth, String color, String loaiDog) {
        super(id, source, dateOfBirth, color);
        this.loaiDog = loaiDog;
        
        
    }
    public String get(){
        return loaiDog;
    }
    @Override
    public void makeSound(){
        System.out.println(" Cho keu: gau gau gau gau! ");
        System.out.println("");
    }
    @Override
    public String toString (){
        return super.toString() + " loai cho: " + loaiDog;
    }
    
}

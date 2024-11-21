
package QuanLyDongVat;

public class Cat extends Animal{
    private String mauMat;

    public Cat(String id, String source, String dateOfBirth, String color, String mauMat) {
        super(id, source, dateOfBirth, color);
        this.mauMat = mauMat;
    }
    public String get(){
        return mauMat;
        
    }
    @Override
    public void makeSound(){
        System.out.println(" con meo keu: meo meo meo meo! ");
        System.out.println("");
    }
    @Override
    public String toString(){
        return super.toString() + "mau mat: " + mauMat;
    }
        
        
    
}

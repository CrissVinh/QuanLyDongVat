
package QuanLyDongVat;

public  class Animal {
    private String id;
    private String source;
    private String dateOfBirth;
    private String color;
    
    public Animal(String id, String source, String dateOfBirth, String color ){
        this.id = id;
        this.source = source;
        this.dateOfBirth = dateOfBirth;
        this.color = color;
        
    }
    public String id(){
    return id;
}
    public String getSource(){
        return source;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    } 
    public String getColor(){
        return color;
    }
    public void makeSound(){
        System.out.println(" Dong vat nay keu! ");
    }
        
    @Override
    public String toString(){
        return " id:" + id + "source:" + source + "dateOfBirth:" + dateOfBirth + " color:" + color;
    }
    
}

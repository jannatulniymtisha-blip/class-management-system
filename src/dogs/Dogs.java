
package dogs;


public class Dogs {
    String breed,size,color;
    int age;
    
    public String getinfo(){
        
        return("Breed is: "+breed+" Size is:"+size+" Age is:"+age+" color is: "+color);
    }
    

    public static void main(String[] args) {
        Dogs maltese = new Dogs();
        maltese.breed = "Maltese";
        maltese.size = "Small";
        maltese.age = 2;
        maltese.color = "White";
        System.out.println(maltese.getinfo());
    }

    
    
    
}

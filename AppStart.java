
public class AppStart
{
    public static void main(String[] args){
        Size a = Size.MEDIUM;
        
        System.out.println("Name         : "+ a.name());
        System.out.println("toString()   : "+ a.toString());
        System.out.println("Ordem        : 1");
        System.out.println("Valor minimo : "+ a.getMinValue());
        System.out.println("Valor maximo : "+ a.getMaxValue());
        System.out.println("Código       : "+ a.getCode());
    
    
    }
}

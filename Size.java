/**
 * Enum class for cup sizes
 */
public enum Size {

     SMALL(32, 36, "Pequeno",'S'),
     MEDIUM(37, 44, "Médio",'M'),
     LARGE(45, 52, "Grande",'L');
     
     private final String description;
     private final int minValue;
     private final int maxValue;
     private final char code;
     
     /**
      * Constructor
      */
     private Size(int minValue, int maxValue, String description, char code){
         this.description=description;
         this.minValue=minValue;
         this.maxValue=maxValue;
         this.code=code;
     }
     
     /**
      * returns the descrition
      */
     @Override
     public String toString() {
         return this.description;
     }
     /**
      * returns description
      */
     public String getDescription() {
         return description;
     }
     /**
      * returns minValue
      */
     public int getMinValue() {
         return minValue;
     }
     /**
      * returns Max value
      */
     public int getMaxValue() {
         return maxValue;
     }
     /**
      * returns code
      */
     public char getCode() {
         return code;
     }

}

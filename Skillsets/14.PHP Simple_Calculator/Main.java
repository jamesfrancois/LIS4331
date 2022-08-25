class Main
{
public static void main(String[] args)
{
//call static methods (i.e., no object)
Methods.getRequirements();
int arraySize = 0;
arraySize = Methods.validateArraySize();
Methods.calculateNumbers(arraySize);
 }
}

public class Shirt {
	// Os c�digos de cores s�o: R = Vermelho, B = Azul, G = Verde, U = N�o definido //
	public int shirtID = 0;
	public String description = "-Descri��o necess�ria-";
	public char colorCode = 'U';
	public double price = 0.00;
	public int quantityInStock = 0;
	
	//M�todo para exibir as informa��es//
	
	public void displayInformation() {
		System.out.println("Shirt ID: " + shirtID);
		System.out.println("Shirt description:" + description);
		System.out.println("Color Code: " + colorCode);
		System.out.println("Shirt price: " + price);
		System.out.println("Quantity in stock: " + quantityInStock);
		}
	}
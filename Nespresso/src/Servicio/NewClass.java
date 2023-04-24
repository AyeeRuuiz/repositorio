
package Servicio;

public class NewClass { 

//package Entidades;


}
package Servicios;



public class CadenaServicios {
    public void MostrarVocales(Cadena prueba) {
		int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;
		String texto= prueba.getFrase();
		for (int i = 0; i < prueba.getLongitudfrase(); i++) {
			switch (texto.charAt(i)) {
			case 'a':
				contA++;
				break;
			case 'e':
				contE++;
				break;
			case 'i':
				contI++;
				break;
			case 'o':
				contO++;
				break;
			case 'u':
				contU++;
				break;
			}
		
		}
		System.out.println(contA+ "-" + contE + contI + contO + contU);
		System.out.println(contA+ "-" + contE + contI + contO + contU);
	}
        
        
    
}
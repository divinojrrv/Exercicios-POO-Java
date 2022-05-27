package PROVA_OO;

public class Ex1_Empregado {
	
	public static double SalarioAnual(double sal){
		sal = (sal*12);
		return sal;
	}
	
	public static double SalarioAnual10Porcnt(double sal){
		double dezporcnt = 0;
		
		dezporcnt = sal * 0.10;
		
		sal = ((sal * 12) + (dezporcnt * 12));
		return sal;
	}
	
    public static void main(String[] args) {
	Empregado Empregado1 = new Empregado(); //Empregado
	Empregado Empregado2 = new Empregado(); //Empregado
	
	Empregado1.setNome("Divino");
	Empregado1.setSobrenome("Mendes");
	Empregado1.setSalario(1500.00);
	
	Empregado2.setNome("Mateus");
	Empregado2.setSobrenome("Kilua");
	Empregado2.setSalario(100.00);
	
	
    System.out.println("Salário anual dos empregados:");
    System.out.printf("Empregado 1 = %f \nEmpregado 2 = %f", SalarioAnual(Empregado1.getSalario()) , SalarioAnual(Empregado2.getSalario()));
	
    System.out.println("\n \n Salário anual dos empregados com 10%:");
    System.out.printf("Empregado 1 = %f \nEmpregado 2 = %f", SalarioAnual10Porcnt(Empregado1.getSalario()), SalarioAnual10Porcnt(Empregado2.getSalario()) );

    }
}

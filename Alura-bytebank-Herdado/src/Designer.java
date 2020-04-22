//gerente é um funcionario. gerente herda do class funcionario
public class Designer extends Funcionario {

	public double getBonificacao() {
		System.out.println("chamando a bonificacao de DESIGNER");
		return 200;
	}
}

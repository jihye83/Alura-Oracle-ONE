//gerente é um funcionario. gerente herda do class funcionario
public class EditorVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("chamando a bonificacao de EDITORVIDEO");
		return 150;
	}
}

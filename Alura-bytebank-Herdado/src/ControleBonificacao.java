
public class ControleBonificacao {

	private double soma;

//	public void registra(Gerente g) {                        polimorfismo: todo cargo passa por objeto Funcionario.
//		double boni = g.getBonificacao();					 pq todos (gerente, editorVideo) recebe heranca(extends)
//		this.soma = this.soma + boni;
//	}

	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}

//	public void registra(EditorVideo ev) {
//		double boni = ev.getBonificacao();
//		this.soma = this.soma + boni;
//	}

	public double getSoma() {
		return soma;
	}

}

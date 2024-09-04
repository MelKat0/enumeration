package aula6;

public class PrincipalStatus {
	
	public static void main(String[] args) {
		StatusPedido status = StatusPedido.ABERTO;
		StatusPedido status1 = StatusPedido.EM_ANDAMENTO;
		StatusPedido status2 = StatusPedido.ENTREGUE;
		StatusPedido status3 = StatusPedido.CANCELADO;
		
		System.out.println(status);
		System.out.println(status1);
		System.out.println(status2);
		System.out.println(status3);
	}
}

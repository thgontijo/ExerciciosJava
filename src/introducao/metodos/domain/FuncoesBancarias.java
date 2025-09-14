package introducao.metodos.domain;

public class FuncoesBancarias {
    public double AumentarSaldo(ContaBancaria acesso){
        acesso.saldo = acesso.saldoA + acesso.saldo;
        return acesso.saldo;
    }
    public double DiminuiSaldo(ContaBancaria acesso){
            acesso.saldo = acesso.saldoA - acesso.saldo;
            return acesso.saldo;
        }
    public double AumentarDivida(ContaBancaria acesso){
        acesso.divida = acesso.dividaA + acesso.divida;
        return acesso.divida;
    }
    public double DiminuiDivida(ContaBancaria acesso){
        acesso.divida = acesso.divida - acesso.dividaA;
        return acesso.divida;
    }
    public double saldoMenosDivida(ContaBancaria acesso){
        acesso.saldoSemDivida = (acesso.saldo - acesso.divida);
        return acesso.saldoSemDivida;
    }
}

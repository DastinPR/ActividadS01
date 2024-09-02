package ejercicios;

import static javax.swing.JOptionPane.*;

public class Ejercicio12 {
    public static void main(String[] args) {;
        int rep=0,g=0,e=0,t=0,c=0;
        double p=0;

        String[] gas = {"INCA-KOLA\n S/3.50","COCA-COLA\n S/3.50","FANTA\n S/3.00","SPRITE\n S/3.00"},
                estado={"HELADA\n +S/0.20","SIN HELAR\n +S/0.00"},
                tipo={"NORMAL\n +S/0.00","SIN AZUCAR\n +S/0.20"};

        do{
            g=showOptionDialog(null,
                    "Eliga la bebida que quiere ordenar","COMPRA DE BEBIDAS.",DEFAULT_OPTION,INFORMATION_MESSAGE,null,gas,gas[0]);
            e=showOptionDialog(null,
                    "Eliga el estado de la bebida","COMPRA DE BEBIDAS.",DEFAULT_OPTION,INFORMATION_MESSAGE,null,estado,estado[0]);
            t=showOptionDialog(null,
                    "Eliga el tipo de bebida.","COMPRA DE BEBIDAS.",DEFAULT_OPTION,INFORMATION_MESSAGE,null,tipo,tipo[0]);

            if(g==0 || g==1){
                p=p+3.50;
            }else if(g==2 || g==3){
                p=p+3.00;
            }
            if(e==0){
                p=p+0.20;
            }
            if(t==1){
                p=p+0.20;
            }

            showMessageDialog(null,"El precio a pagar por su bebida es:\n Gaseosa: " + gas[g] + "\n Estado: " + estado[e] + "\n Tipo: " + tipo[t] +"\n Precio Final: S/"+
            String.format("%.2f",p),"Bebidas",INFORMATION_MESSAGE);

            rep=showConfirmDialog(null,"¿Repetir Programa?","COMPRA DE BEBIDAS.",YES_NO_OPTION);
            
        }while(rep==0);

    }
}

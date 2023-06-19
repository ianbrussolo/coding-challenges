//se usar vermelho um dia não é patriota; se passar mais de 2 dias seguidos sem usar verde ou amarelo, também não, a menos que tenha usado azul, verde ou amarelo por 4 dias seguidos
//0 - vermelho, 1, 2, 3 - verde, amarelo, azul
public class Patriota {
    static boolean patriota(int[] r){
        int naoUsarVA = 0;
        int usarVAA = 0;
        for (int i = 0; i < 7; i++){
            if (r[i] == 0){
                return false;
            }
            if (r[i] == 1 || r[i] == 2 || r[i] == 3){
                usarVAA ++;
            } else if (usarVAA < 4){
                usarVAA = 0;
            }
            if (r[i] != 1 & r[i] != 2){
                naoUsarVA++;
            } else if (naoUsarVA < 2) {
                naoUsarVA = 0;
            }
        }
        if((naoUsarVA >= 2) && (usarVAA < 4)){
            return false;
        } else {
            return true;
        }
    }
}

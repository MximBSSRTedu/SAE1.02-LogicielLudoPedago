// faire une condition aléatoire (jsp toutes les 3-4 cases)
// 50% facile / 30% normal / 20% difficile
// se lance a chaque déplacement

// true = question

// import random ???? 

class Code extends Program {

    boolean questionOuTranquille(boolean questOuTranquil){
        // on décide un nombre random entre 1 et 100
        // facile       :   i > 1 || i < 50
        // normal       :   i > 51 || i < 80
        // difficile    :   i > 81 || i < 100

        int pourcentage = randomInt(1,100);
        questOuTranquil = false ;
        String difficultee = "facile";

        if (pourcentage >= 1 && pourcentage <= 50){
            questOuTranquil = true ;
            difficultee = "facile";
        } else if (pourcentage >= 51 && pourcentage <= 80){
            questOuTranquil = true ;
            difficultee = "normal";
        } else if (pourcentage >= 81 && pourcentage <= 100){
            questOuTranquil = true ;
            difficultee = "difficile";
        } else {
            questOuTranquil = true ;
            difficultee = "facile";
        }


    }



}
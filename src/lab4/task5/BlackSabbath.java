package lab4.task5;

public class BlackSabbath {
    Vocalist vocalist;
    Guitarist guitarist;
    Bassist bassist;
    Drummer drummer;

    public BlackSabbath(){
        vocalist = new Vocalist("Оззи Осборн");
        guitarist = new Guitarist("Тони Айомми");
        bassist = new Bassist("Гизер Батлер");
        drummer = new Drummer("Билл Уорд");
    }

    void playCoolSong() {
        guitarist.playCoolOpening();
        drummer.startPlaying();
        bassist.followTheDrums();
        guitarist.playCoolRiffs();
        vocalist.singCouplet(1);
        bassist.changeRhythm("припев");
        guitarist.playAnotherCoolRiffs();
        vocalist.singChorus();
        bassist.changeRhythm("куплет");
        guitarist.playCoolRiffs();
        vocalist.singCouplet(2);
        bassist.changeRhythm("припев");
        guitarist.playAnotherCoolRiffs();
        vocalist.singChorus();
        bassist.changeRhythm("куплет");
        guitarist.playIncrediblyCoolSolo();
        guitarist.playCoolRiffs();
        vocalist.singCouplet(3);
        bassist.changeRhythm("припев");
        guitarist.playAnotherCoolRiffs();
        vocalist.singChorus();
        bassist.changeRhythm("куплет");
        guitarist.playCoolRiffs();
        bassist.stopPlaying();
        drummer.stopPlaying();
        guitarist.playFinalAccord();
    }

}

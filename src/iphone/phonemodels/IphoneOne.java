package phonemodels;
import appbrowser.Safari;
import appmusic.Itunes;
import call.Icall;

public class IphoneOne implements Safari, Itunes, Icall {

    // App Itunes
    public void startAppItunes() {
        System.out.println("Itunes is starting...");
        selecionarMusica();
        playMusic();
        stopMusic();
    }

    public void selecionarMusica() {
        System.out.println("In the end");
    }

    public void playMusic() {
        System.out.println("Now is playing Linkin Park - In the end");
    }

    public void stopMusic() {
        System.out.println("Music has stop");
    }

    // App Safari
    public void startAppSafari() {
        System.out.println("Safari is starting...");
        showPage("google.com");
        newTab();
        refreshPage();
    }
    public void showPage(String url) {
        System.out.println("Acessing " + url);
     }

    public void newTab() {
        System.out.println("Showing new page");
    }
    public void refreshPage() {
        System.out.println("Page is refreshing");
    }

    // App Call

    public void startAppCall(String numero) {
        System.out.println("Icall is starting...");
        calling("Fulano");
        acept();
        voiceMail();
    }
    public void calling(String numero) {
        System.out.println("Calling for " + numero);
    }
    public void acept() {
        System.out.println("Acept call?");
    }
    public void voiceMail() {
        System.out.println("You have a new voicemail, u wanna hear?");
    }
}

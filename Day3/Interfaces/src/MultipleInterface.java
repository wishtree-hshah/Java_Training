// Defining interfaces
interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

interface GPS {
    void navigate();
}

// all functionality are performed by same class
// Smartphone implements multiple interfaces
class Smartphone implements Camera, MusicPlayer, GPS {
    @Override
    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to destination...");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone();
        myPhone.takePhoto();
        myPhone.playMusic();
        myPhone.navigate();
    }
}

package Practica3.Ejercicio5;

import java.util.ArrayList;

public class Youtube implements ISubject {
    private ArrayList<IObserver> observers = new ArrayList<>();
    private ArrayList<Video> videos = new ArrayList<>();

    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void addVideo(Video video) {
        this.videos.add(video);
        this.notifyObserver(video.getCategoría());
    }

    public void deVideo(Video video) {
        this.videos.remove(video);
    }

    @Override
    public void attach(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void deAttach(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver(String categoriaVideo) {
        for (int i = 0; i < this.observers.size(); i++) {
            if(this.observers.get(i).getCategoriaMsg().equals(categoriaVideo)){
                this.observers.get(i).update("Nuevo video diponible de "+categoriaVideo);
            }else if(categoriaVideo.equals("anyCategory")){
                this.observers.get(i).update("Nuevo video diponible de "+ categoriaVideo);
            }
        }
    }
}

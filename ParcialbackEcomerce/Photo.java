package ParcialbackEcomerce;

public class Photo {
//fichero
private String file;
public Photo(String file) {
    this.file = file;
}

public String getFile() {
    return file;
}

public void setFile(String file) {
    this.file = file;
}

@Override
public String toString() {
    return "Foto {file= " + file + " }";
}

}

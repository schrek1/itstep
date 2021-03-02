package cz.itstep.lecture1;

public class FileNotFound extends ApplicationException {
    public String requestedPath;
    public String requestedResource;

    @Override
    public String toString() {
        return "FileNotFound{" +
                "requestedPath='" + requestedPath + '\'' +
                ", requestedResource='" + requestedResource + '\'' +
                '}';
    }
}

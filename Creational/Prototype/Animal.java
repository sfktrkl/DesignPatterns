// By making this class cloneable you are telling Java
// that it is ok to copy instances of this class.
public interface Animal extends Cloneable {

    public Animal makeCopy();

}

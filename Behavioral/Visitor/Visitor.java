// The visitor pattern is used when you have to perform
// the same action on many objects of different types
interface Visitor {

    // Created to automatically use the right
    // code based on the Object sent
    // Method Overloading
    public double visit(Liquor liquor);

    public double visit(Tobacco tobacco);

}

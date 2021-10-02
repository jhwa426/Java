package noncompositefiles;

class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void printFileHierarchy() {
        System.out.println(FileClient.indentRight + name);
    }
}

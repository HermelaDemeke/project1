public class TrimmerDecorator extends Decorator {
    public TrimmerDecorator(Nameable nameable) {
        super(nameable);
    }

    @Override
    public String getCorrectName() {
        String name = nameable.getCorrectName();
        if (name.length() > 4) {
            return name.substring(0, 4);
        }
        return name;
    }

}

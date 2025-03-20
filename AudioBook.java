public class AudioBook extends Title {
    private int durationInMinutes;

    public AudioBook(String literatureType, int copies, int durationInMinutes) {
        super(literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }


    @Override
    protected double calculatePoints() {
        double literaturePoint = switch (literatureType) {
            case "BI", "TE" -> 1.5;
            case "LYRIK" -> 3;
            case "SKØN" -> 0.85;
            case "FAG" -> 0.5;
            default -> 0;
        };
        return (durationInMinutes * 0.5) * literaturePoint * copies;
    }
}
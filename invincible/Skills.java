package functional_programming.invincible;

public class Skills {

    String code;
    final private String decoder;
    private final int board;
    protected int runway;

    // constructor <=
    public Skills(String code, String decoder, int board) {
        this.code = code;
        this.decoder = decoder;
        this.board = board;
    }

    // repeat

    public Boolean Reference() {
        return "coding".equals(this.decoder);
    }

    // getter

    public String getDecoder() {
        return this.decoder;
    }

    public int getBoard() { return this.board; }

    // setter

    public void setBoard(int new_board) {
        if (new_board < 256) {  // 8^2: 256: byte
            new_board = this.board;
        } else {
            System.out.println("dato no admitido por el decodificador");
        }
    }

    public int Complete(int count, int found, int repeat) {
        /* contador para llegar al board */

        this.runway = count;

        for (int i= 0; i<count; i++) {
            if (found == repeat) {
                return this.board;
            } else if (this.board >= repeat) {
                found += repeat;
            }
        }
        return found;
    }

    public static class SpecificSkills {

        String code;
        final private String decoder;
        public SpecificSkills(String code, String decoder) {
            this.code = code;
            this.decoder = decoder;
        }

        public Boolean Reference() { return true; }

        public String getDecoder() { return this.decoder; }

    }
}

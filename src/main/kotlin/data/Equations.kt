package data


enum class equation(
    val title: String,
    val content: String,
    val equationIcon: List<String>
) {
    //TODO Give Content, Change Images
    dixotomisi(
        title = "Μέθοδος της Διχοτόμησης",
        content = "",
        equationIcon = listOf("ic_function.png")
    ),
    RegulaFalsi(
        title = "Μέθοδος Regula falsi",
        content = "",
        equationIcon = listOf("ic_function.png")
    ),
    Muller(
        title = "Μέθοδος Muller",
        content = "Η μέθοδος αυτή είναι παρόμοια με τη μέθοδο τέμνουσας αλλά προσεγγίζει τη\n" +
                "    συνάρτηση με παραβολή (εξίσωση της μορφής y = ax2 + bx + c) και επομένως\n" +
                "    χρειάζεται τρία σημεία για τον προσδιορισμό της. Η νέα προσέγγιση της ρίζας\n" +
                "    είναι η ρίζα της παραβολής που είναι πιο κοντά στην προηγούμενη προσέγγιση.\n" +
                "    Επομένως, επιλέγουμε τα σημεία x0, x1, x2 και ορίζουμε την παραβολή",
        equationIcon = listOf("/basicEquation/Muller basic.svg")
    )


}

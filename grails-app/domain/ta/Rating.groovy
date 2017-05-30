package ta

/**
 * Created by wfmf on 5/29/17.
 */
enum Rating {
    MA("Meta Aprendida"), MPA("Meta Parcialment Aprendida"), MANA("Meta Ainda Não Aprendida")
    def description

    Rating(value) {
        this.description = value
    }
}
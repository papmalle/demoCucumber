import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.runner.RunWith;

public class PersonMyStepdefs  {

    @Given("L'entrepôt contient N Personnes")
    public void l_entrepôt_contient_N_Personnes() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Je crée une personne")
    public void je_crée_une_personne() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("J{string}ID de la Personne créée et l'entrepôt contient plus de N Personnes")
    public void j_ID_de_la_Personne_créée_et_l_entrepôt_contient_plus_de_N_Personnes(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("L'entrepôt contient la Personnes Anakin Skywalker")
    public void l_entrepôt_contient_la_Personnes_Anakin_Skywalker() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Je supprimer la Personne {int}")
    public void je_supprimer_la_Personne(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("L'entrepôt contient moins de N Personnes")
    public void l_entrepôt_contient_moins_de_N_Personnes() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Je recupère la Personne {int}")
    public void je_recupère_la_Personne(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("J{string}identifiant {int} contenant les données Anakin, Skywalker, {double} BBY")
    public void j_identifiant_contenant_les_données_Anakin_Skywalker_BBY(String string, Integer int1, Double double1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("J{string}identifiant {int} contenant les données Luke, Skywalker, {int} BBY")
    public void j_identifiant_contenant_les_données_Luke_Skywalker_BBY(String string, Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("J{string}identifiant {int} contenant les données Leia, Organa Solo, {int} BBY")
    public void j_identifiant_contenant_les_données_Leia_Organa_Solo_BBY(String string, Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("L'entrepôt contient les Personnes suivantes")
    public void l_entrepôt_contient_les_Personnes_suivantes(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new cucumber.api.PendingException();
    }

    @When("Je modifie la Personne {int} avec Organa Solo Skywalker")
    public void je_modifie_la_Personne_avec_Organa_Solo_Skywalker(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("J{string}identifiant {int} contenant les données Leia, Organa Solo Skywalker, {int} BBY")
    public void j_identifiant_contenant_les_données_Leia_Organa_Solo_Skywalker_BBY(String string, Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}

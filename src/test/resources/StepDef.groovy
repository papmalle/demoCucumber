import cucumber.api.PendingException

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

When(~/^Je modifie la Personne <id> avec <nom>$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
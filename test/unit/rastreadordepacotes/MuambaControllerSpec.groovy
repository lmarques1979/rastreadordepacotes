package rastreadordepacotes

import spock.lang.Specification

@TestFor(MuambaController)
@Mock(Muamba)
class MuambaControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.muambaInstanceList
            model.muambaInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
            controller.create()

        then:"The model is correctly created"
            model.muambaInstance!= null
    }

    void "Test the save action correctly persists an instance"() {

        when:"The save action is executed with an invalid instance"
            request.contentType = FORM_CONTENT_TYPE
            def muamba = new Muamba()
            muamba.validate()
            controller.save(muamba)

        then:"The create view is rendered again with the correct model"
            model.muambaInstance!= null
            view == 'create'

        when:"The save action is executed with a valid instance"
            response.reset()
            populateValidParams(params)
            muamba = new Muamba(params)

            controller.save(muamba)

        then:"A redirect is issued to the show action"
            response.redirectedUrl == '/muamba/show/1'
            controller.flash.message != null
            Muamba.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when:"The show action is executed with a null domain"
            controller.show(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the show action"
            populateValidParams(params)
            def muamba = new Muamba(params)
            controller.show(muamba)

        then:"A model is populated containing the domain instance"
            model.muambaInstance == muamba
    }

    void "Test that the edit action returns the correct model"() {
        when:"The edit action is executed with a null domain"
            controller.edit(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the edit action"
            populateValidParams(params)
            def muamba = new Muamba(params)
            controller.edit(muamba)

        then:"A model is populated containing the domain instance"
            model.muambaInstance == muamba
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when:"Update is called for a domain instance that doesn't exist"
            request.contentType = FORM_CONTENT_TYPE
            controller.update(null)

        then:"A 404 error is returned"
            response.redirectedUrl == '/muamba/index'
            flash.message != null


        when:"An invalid domain instance is passed to the update action"
            response.reset()
            def muamba = new Muamba()
            muamba.validate()
            controller.update(muamba)

        then:"The edit view is rendered again with the invalid instance"
            view == 'edit'
            model.muambaInstance == muamba

        when:"A valid domain instance is passed to the update action"
            response.reset()
            populateValidParams(params)
            muamba = new Muamba(params).save(flush: true)
            controller.update(muamba)

        then:"A redirect is issues to the show action"
            response.redirectedUrl == "/muamba/show/$muamba.id"
            flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when:"The delete action is called for a null instance"
            request.contentType = FORM_CONTENT_TYPE
            controller.delete(null)

        then:"A 404 is returned"
            response.redirectedUrl == '/muamba/index'
            flash.message != null

        when:"A domain instance is created"
            response.reset()
            populateValidParams(params)
            def muamba = new Muamba(params).save(flush: true)

        then:"It exists"
            Muamba.count() == 1

        when:"The domain instance is passed to the delete action"
            controller.delete(muamba)

        then:"The instance is deleted"
            Muamba.count() == 0
            response.redirectedUrl == '/muamba/index'
            flash.message != null
    }
}

package org.sunbird.content.actors

import akka.actor.Props
import org.sunbird.graph.OntologyEngineContext

class TestCollectionActor extends BaseSpec {

    "CollectionActor" should "return failed response for 'unknown' operation" in {
        implicit val oec: OntologyEngineContext = new OntologyEngineContext
        testUnknownOperation(Props(new CollectionActor()))
    }
}
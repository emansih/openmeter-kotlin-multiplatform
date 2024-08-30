/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package xyz.hisname.openmeter.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import xyz.hisname.openmeter.apis.SubjectsApi
import xyz.hisname.openmeter.models.Problem
import xyz.hisname.openmeter.models.Subject

class SubjectsApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of SubjectsApi
        //val apiInstance = SubjectsApi()

        // to test deleteSubject
        should("test deleteSubject") {
            // uncomment below to test deleteSubject
            //val subjectIdOrKey : kotlin.String = customer-id // kotlin.String | A unique identifier for a subject.
            //apiInstance.deleteSubject(subjectIdOrKey)
        }

        // to test getSubject
        should("test getSubject") {
            // uncomment below to test getSubject
            //val subjectIdOrKey : kotlin.String = customer-id // kotlin.String | A unique identifier for a subject.
            //val result : Subject = apiInstance.getSubject(subjectIdOrKey)
            //result shouldBe ("TODO")
        }

        // to test listSubjects
        should("test listSubjects") {
            // uncomment below to test listSubjects
            //val result : kotlin.collections.List<Subject> = apiInstance.listSubjects()
            //result shouldBe ("TODO")
        }

        // to test upsertSubject
        should("test upsertSubject") {
            // uncomment below to test upsertSubject
            //val subject : kotlin.collections.List<Subject> =  // kotlin.collections.List<Subject> | The subject to upsert.
            //val result : kotlin.collections.List<Subject> = apiInstance.upsertSubject(subject)
            //result shouldBe ("TODO")
        }

    }
}

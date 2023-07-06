/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.springframework.samples.petclinic.rest.api

import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import jakarta.validation.Valid
import jakarta.validation.constraints.Min
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.samples.petclinic.rest.dto.RestErrorDto
import org.springframework.samples.petclinic.rest.dto.VetDto
import org.springframework.samples.petclinic.rest.dto.VetFieldsDto
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@Validated
@RequestMapping("\${api.base-path:/petclinic/api}")
interface VetsApi {

    @Operation(
        summary = "Create a Vet",
        operationId = "addVet",
        description = """Creates a vet .""",
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "Vet created successfully.",
                content = [Content(schema = Schema(implementation = VetDto::class))]
            ),
            ApiResponse(responseCode = "304", description = "Not modified."),
            ApiResponse(
                responseCode = "400",
                description = "Bad request.",
                content = [Content(schema = Schema(implementation = RestErrorDto::class))]
            ),
            ApiResponse(
                responseCode = "404",
                description = "Vet not found.",
                content = [Content(schema = Schema(implementation = RestErrorDto::class))]
            ),
            ApiResponse(
                responseCode = "500",
                description = "Server error.",
                content = [Content(schema = Schema(implementation = RestErrorDto::class))]
            )
        ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/vets"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun addVet(
        @Parameter(
            description = "The vet",
            required = true
        ) @Valid @RequestBody vetDto: VetDto
    ): ResponseEntity<VetDto> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete a vet by ID",
        operationId = "deleteVet",
        description = """Returns the vet or a 404 error.""",
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "Vet details found and returned.",
                content = [Content(schema = Schema(implementation = VetDto::class))]
            ),
            ApiResponse(responseCode = "304", description = "Not modified."),
            ApiResponse(
                responseCode = "400",
                description = "Bad request.",
                content = [Content(schema = Schema(implementation = RestErrorDto::class))]
            ),
            ApiResponse(
                responseCode = "404",
                description = "Vet not found.",
                content = [Content(schema = Schema(implementation = RestErrorDto::class))]
            ),
            ApiResponse(
                responseCode = "500",
                description = "Server error.",
                content = [Content(schema = Schema(implementation = RestErrorDto::class))]
            )
        ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/vets/{vetId}"],
        produces = ["application/json"]
    )
    fun deleteVet(
        @Min(0) @Parameter(
            description = "The ID of the vet.",
            required = true
        ) @PathVariable("vetId") vetId: Int
    ): ResponseEntity<VetDto> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get a vet by ID",
        operationId = "getVet",
        description = """Returns the vet or a 404 error.""",
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "Vet details found and returned.",
                content = [Content(schema = Schema(implementation = VetDto::class))]
            ),
            ApiResponse(responseCode = "304", description = "Not modified."),
            ApiResponse(
                responseCode = "400",
                description = "Bad request.",
                content = [Content(schema = Schema(implementation = RestErrorDto::class))]
            ),
            ApiResponse(
                responseCode = "404",
                description = "Vet not found.",
                content = [Content(schema = Schema(implementation = RestErrorDto::class))]
            ),
            ApiResponse(
                responseCode = "500",
                description = "Server error.",
                content = [Content(schema = Schema(implementation = RestErrorDto::class))]
            )
        ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/vets/{vetId}"],
        produces = ["application/json"]
    )
    fun getVet(
        @Min(0) @Parameter(
            description = "The ID of the vet.",
            required = true
        ) @PathVariable("vetId") vetId: Int
    ): ResponseEntity<VetDto> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Lists vets",
        operationId = "listVets",
        description = """Returns an array of vets.""",
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "Vets found and returned.",
                content = [Content(schema = Schema(implementation = VetDto::class))]
            ),
            ApiResponse(responseCode = "304", description = "Not modified."),
            ApiResponse(
                responseCode = "500",
                description = "Server error.",
                content = [Content(schema = Schema(implementation = RestErrorDto::class))]
            )
        ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/vets"],
        produces = ["application/json"]
    )
    fun listVets(): ResponseEntity<List<VetDto>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update a vet  by ID",
        operationId = "updateVet",
        description = """Returns the vet or a 404 error.""",
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "Pet type details found and returned.",
                content = [Content(schema = Schema(implementation = VetDto::class))]
            ),
            ApiResponse(responseCode = "304", description = "Not modified."),
            ApiResponse(
                responseCode = "400",
                description = "Bad request.",
                content = [Content(schema = Schema(implementation = RestErrorDto::class))]
            ),
            ApiResponse(
                responseCode = "404",
                description = "Vet not found.",
                content = [Content(schema = Schema(implementation = RestErrorDto::class))]
            ),
            ApiResponse(
                responseCode = "500",
                description = "Server error.",
                content = [Content(schema = Schema(implementation = RestErrorDto::class))]
            )
        ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        value = ["/vets/{vetId}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateVet(
        @Min(0) @Parameter(
            description = "The ID of the vet.",
            required = true
        ) @PathVariable("vetId") vetId: Int,
        @Parameter(description = "The vet", required = true) @Valid @RequestBody vetFieldsDto: VetFieldsDto
    ): ResponseEntity<VetDto> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}

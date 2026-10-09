package com.switchly.api.Controller;

import com.switchly.api.Service.OrganizationService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vi")
public class OrganizationController {

        private final OrganizationService organizationService;

        public OrganizationController(OrganizationService organizationService) {
            this.organizationService = organizationService;
        }
}

     @PostMapping("/orgs")
     @ResponseStatus(HttpStatus.CREATED)

     public Organization create(@Valid @RequestBody CreateOrganizationRequest request) {
       return OrganizationService.create(request.name());
     }

     @GetMapping("/orgs")
     publicList<Organization> getAll() {
        return OrganizationService.getAll();
     }

     @GetMapping("/{orgId}")
     public Organization getById(@PathVariable UUID orgId) {
      return organizationService.getById(orgId);
     }


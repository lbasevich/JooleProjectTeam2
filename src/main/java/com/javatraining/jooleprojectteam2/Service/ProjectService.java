package com.javatraining.jooleprojectteam2.Service;

import com.javatraining.jooleprojectteam2.Entity.Product;
import com.javatraining.jooleprojectteam2.Entity.Project;
import com.javatraining.jooleprojectteam2.Entity.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProjectService {
    Project create(Project project);
    Project findOne(String projectId);
    Project update(String projectId, Project project);
    Project delete(Project project);

    Project createProjectForUser(String username, Project project);
    Project removeProjectForUser(String username, String projectId);

    Project addProductIntoProject(String projectId, Product product);
    Project removeProductInProject(String projectId, String productID);
}

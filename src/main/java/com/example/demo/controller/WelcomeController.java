package com.example.demo.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class WelcomeController {

    @GetMapping("/")
    public String home(Model model) {
        // Basic app information
        model.addAttribute("appName", "My Demo App");
        model.addAttribute("welcomeTitle", "Welcome to Innovation");
        model.addAttribute("welcomeMessage", "Discover cutting-edge solutions for modern development");
        model.addAttribute("companyName", "Tech Innovations Ltd");

        // Add feature list
        List<Feature> features = Arrays.asList(
                new Feature("⚡", "Fast Performance", "Built with Spring Boot for optimal performance and reliability"),
                new Feature("🔒", "Secure", "Enterprise-grade security with modern authentication systems"),
                new Feature("📱", "Responsive", "Works perfectly on desktop, tablet, and mobile devices"),
                new Feature("🚀", "Scalable", "Designed to grow with your business needs"),
                new Feature("🔧", "Customizable", "Flexible configuration options for various use cases"),
                new Feature("📊", "Analytics", "Built-in reporting and analytics dashboard")
        );
        model.addAttribute("features", features);

        // Add statistics
        List<Statistic> stats = Arrays.asList(
                new Statistic("1000+", "Happy Users"),
                new Statistic("99.9%", "Uptime"),
                new Statistic("24/7", "Support"),
                new Statistic("50+", "Features")
        );
        model.addAttribute("stats", stats);

        // Page metadata
        model.addAttribute("pageTitle", "Home - My Demo App");
        model.addAttribute("pageDescription", "Welcome to our innovative demo application");

        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("pageTitle", "About - My Demo App");
        return "about";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("pageTitle", "Contact - My Demo App");
        return "contact";
    }

    @GetMapping("/features")
    public String features(Model model) {
        model.addAttribute("pageTitle", "Features - My Demo App");
        return "features";
    }

    @GetMapping("/demo")
    public String demo(Model model) {
        model.addAttribute("pageTitle", "Demo - My Demo App");
        return "demo";
    }

    // Inner classes for data transfer
    @Getter
    public static class Feature {
        // Getters
        private final String icon;
        private final String title;
        private final String description;

        public Feature(String icon, String title, String description) {
            this.icon = icon;
            this.title = title;
            this.description = description;
        }

    }

    @Getter
    public static class Statistic {
        // Getters
        private final String value;
        private final String label;

        public Statistic(String value, String label) {
            this.value = value;
            this.label = label;
        }

    }
}
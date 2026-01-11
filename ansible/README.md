# Ansible Infrastructure Provisioning

This directory contains Ansible playbooks to provision and configure the local infrastructure for the VProfile application.

## 📋 Playbooks Overview

- **`site.yml`**: The main entry point that coordinates all other playbooks.
- **`tomcat_setup.yml`**: Provisions the Tomcat application server, installs JDK, and sets up service files for different Linux distributions (CentOS, Ubuntu).
- **`vpro-app-setup.yml`**: Configures specific application settings and handles artifact deployment.

## 🚀 How to Run

1.  **Prerequisites**:
    - Ansible installed on your control machine.
    - SSH access to the target servers defined in your inventory.

2.  **Configure Inventory**:
    Update the `ansible.cfg` or create an `inventory` file with your server details under the `appsrvgrp` group.

3.  **Execute the Playbook**:
    ```bash
    ansible-playbook -i <inventory_file> site.yml
    ```

## 📂 Structure
- **`templates/`**: Contains Jinja2 templates for systemd/init.d service files, ensuring cross-distro compatibility.

package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.Tool;

public class Worker {
    private Tool tool;

    public Worker(Tool tool) {
        this.tool = tool;
        System.out.println("Assigning tool instance to Worker");
    }

    public void build() {
        if (this.tool != null) {
            this.tool.use();
            System.out.println("Building in Worker");
        } else {
            System.out.println("null");
        }
    }
}

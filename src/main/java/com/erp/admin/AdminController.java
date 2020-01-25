package com.erp.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *  @ Administrator Controller
 */
@Controller
@RequestMapping
public class AdminController 
{
    @Autowired public Environment    env;
}

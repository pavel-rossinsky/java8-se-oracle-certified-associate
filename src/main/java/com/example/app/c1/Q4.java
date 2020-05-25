package com.example.app.c1;

import java.util.*;
import java.sql.*;

// Compilation error: reference to Date is ambiguous
public class Q4 {
    private Date rob = new Date();
    private java.util.Date sharon = new java.util.Date();
}

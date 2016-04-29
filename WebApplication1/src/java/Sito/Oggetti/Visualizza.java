/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sito.Oggetti;

import Sito.Oggetti.Classi.ItemsFactory;
import Sito.Oggetti.Classi.ItemsVendita;
import Sito.Oggetti.Classi.UsersFactory;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author luca
 */
public class Visualizza extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(false);
        ItemsFactory data;
        UsersFactory arch= (UsersFactory)session.getAttribute("Archivio");
        
        data = (ItemsFactory)UsersFactory.getData();
        
        if(request.getParameter("cat").equals("Auto")){
            for(ItemsVendita i : data.getListaAuto()){
                if(i.areTheSame((int)Integer.parseInt(request.getParameter("id")))){
                    request.setAttribute("inserzione", i);
                }
            }
        }
        if(request.getParameter("cat").equals("Moto")){
            for(ItemsVendita i : data.getListaMoto()){
                if(i.areTheSame((int)Integer.parseInt(request.getParameter("id")))){
                    request.setAttribute("inserzione", i);
                }
            }
        }
        if(request.getParameter("cat").equals("Yatch")){
            for(ItemsVendita i : data.getListaYatch()){
                if(i.areTheSame((int)Integer.parseInt(request.getParameter("id")))){
                    request.setAttribute("inserzione", i);
                }
            }
        }
        if(request.getParameter("cat").equals("Barche")){
            for(ItemsVendita i : data.getListaBarche()){
                if(i.areTheSame((int)Integer.parseInt(request.getParameter("id")))){
                    request.setAttribute("inserzione", i);
                }
            }
        }
        request.getRequestDispatcher("M3/struttura/inserzione.jsp").forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

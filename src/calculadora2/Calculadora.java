package calculadora2;

/**
 *
 * @author EDGAR GAEL
 */
public class Calculadora extends javax.swing.JFrame {
//Atributos para las operaciones basicas
    private double valor1 = 0;
    private String operacion = null;
    public Calculadora() {
        initComponents();
    }
    //Factorial
    public int factorial(int zapato){
        if(zapato==0){
            return 1;
        }else{
            return zapato * factorial(zapato - 1);
        }   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnBorrarTodo = new javax.swing.JButton();
        btnBorrarE = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();
        btnSen = new javax.swing.JButton();
        btnPotencia = new javax.swing.JButton();
        btnPotencia2 = new javax.swing.JButton();
        btnFraccion = new javax.swing.JButton();
        btnLogaritmoNatural = new javax.swing.JButton();
        btnLogaritmo2 = new javax.swing.JButton();
        btnFactorial = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnPorcentaje = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        jrbHexa = new javax.swing.JRadioButton();
        jrbBinario = new javax.swing.JRadioButton();
        jrbDecimal = new javax.swing.JRadioButton();
        btnAutor = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDatos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btn1.setText("1");
        btn1.setMaximumSize(new java.awt.Dimension(53, 23));
        btn1.setMinimumSize(new java.awt.Dimension(53, 23));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.setMaximumSize(new java.awt.Dimension(53, 23));
        btn2.setMinimumSize(new java.awt.Dimension(53, 23));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.setMaximumSize(new java.awt.Dimension(53, 23));
        btn3.setMinimumSize(new java.awt.Dimension(53, 23));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.setMaximumSize(new java.awt.Dimension(53, 23));
        btn4.setMinimumSize(new java.awt.Dimension(53, 23));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.setMaximumSize(new java.awt.Dimension(53, 23));
        btn5.setMinimumSize(new java.awt.Dimension(53, 23));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.setMaximumSize(new java.awt.Dimension(53, 23));
        btn6.setMinimumSize(new java.awt.Dimension(53, 23));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setText("7");
        btn7.setMaximumSize(new java.awt.Dimension(53, 23));
        btn7.setMinimumSize(new java.awt.Dimension(53, 23));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.setMaximumSize(new java.awt.Dimension(53, 23));
        btn8.setMinimumSize(new java.awt.Dimension(53, 23));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.setMaximumSize(new java.awt.Dimension(53, 23));
        btn9.setMinimumSize(new java.awt.Dimension(53, 23));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.setMaximumSize(new java.awt.Dimension(53, 23));
        btn0.setMinimumSize(new java.awt.Dimension(53, 23));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnBorrarTodo.setText("C");
        btnBorrarTodo.setMaximumSize(new java.awt.Dimension(53, 23));
        btnBorrarTodo.setMinimumSize(new java.awt.Dimension(53, 23));
        btnBorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTodoActionPerformed(evt);
            }
        });

        btnBorrarE.setText("CE");
        btnBorrarE.setMaximumSize(new java.awt.Dimension(53, 23));
        btnBorrarE.setMinimumSize(new java.awt.Dimension(53, 23));
        btnBorrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarEActionPerformed(evt);
            }
        });

        btnTan.setText("tan");
        btnTan.setMaximumSize(new java.awt.Dimension(53, 23));
        btnTan.setMinimumSize(new java.awt.Dimension(53, 23));
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });

        btnSen.setText("sen");
        btnSen.setMaximumSize(new java.awt.Dimension(53, 23));
        btnSen.setMinimumSize(new java.awt.Dimension(53, 23));
        btnSen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSenActionPerformed(evt);
            }
        });

        btnPotencia.setText("x^2");
        btnPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaActionPerformed(evt);
            }
        });

        btnPotencia2.setText("x^y");
        btnPotencia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotencia2ActionPerformed(evt);
            }
        });

        btnFraccion.setLabel("1/x");
        btnFraccion.setMaximumSize(new java.awt.Dimension(53, 23));
        btnFraccion.setMinimumSize(new java.awt.Dimension(53, 23));
        btnFraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFraccionActionPerformed(evt);
            }
        });

        btnLogaritmoNatural.setLabel("ln");
        btnLogaritmoNatural.setMaximumSize(new java.awt.Dimension(53, 23));
        btnLogaritmoNatural.setMinimumSize(new java.awt.Dimension(53, 23));
        btnLogaritmoNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogaritmoNaturalActionPerformed(evt);
            }
        });

        btnLogaritmo2.setLabel("log");
        btnLogaritmo2.setMaximumSize(new java.awt.Dimension(53, 23));
        btnLogaritmo2.setMinimumSize(new java.awt.Dimension(53, 23));
        btnLogaritmo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogaritmo2ActionPerformed(evt);
            }
        });

        btnFactorial.setLabel("x!");
        btnFactorial.setMaximumSize(new java.awt.Dimension(53, 23));
        btnFactorial.setMinimumSize(new java.awt.Dimension(53, 23));
        btnFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactorialActionPerformed(evt);
            }
        });

        btnCos.setText("cos");
        btnCos.setMaximumSize(new java.awt.Dimension(53, 23));
        btnCos.setMinimumSize(new java.awt.Dimension(53, 23));
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosActionPerformed(evt);
            }
        });

        btnSuma.setLabel("+");
        btnSuma.setMaximumSize(new java.awt.Dimension(53, 23));
        btnSuma.setMinimumSize(new java.awt.Dimension(53, 23));
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnResta.setLabel("-");
        btnResta.setMaximumSize(new java.awt.Dimension(53, 23));
        btnResta.setMinimumSize(new java.awt.Dimension(53, 23));
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnDividir.setLabel("/");
        btnDividir.setMaximumSize(new java.awt.Dimension(53, 23));
        btnDividir.setMinimumSize(new java.awt.Dimension(53, 23));
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnPorcentaje.setLabel("%");
        btnPorcentaje.setMaximumSize(new java.awt.Dimension(53, 23));
        btnPorcentaje.setMinimumSize(new java.awt.Dimension(53, 23));
        btnPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentajeActionPerformed(evt);
            }
        });

        btnMulti.setLabel("x");
        btnMulti.setMaximumSize(new java.awt.Dimension(53, 23));
        btnMulti.setMinimumSize(new java.awt.Dimension(53, 23));
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });

        btnRaiz.setLabel("Raiz");
        btnRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizActionPerformed(evt);
            }
        });

        jrbHexa.setText("A. hexacecimal");
        jrbHexa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbHexaActionPerformed(evt);
            }
        });

        jrbBinario.setText("A. Binario");
        jrbBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbBinarioActionPerformed(evt);
            }
        });

        jrbDecimal.setText("A. Decimal");
        jrbDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDecimalActionPerformed(evt);
            }
        });

        btnAutor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAutor.setText("Autor");
        btnAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorActionPerformed(evt);
            }
        });

        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        txtDatos.setColumns(12);
        txtDatos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtDatos.setRows(1);
        jScrollPane1.setViewportView(txtDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBorrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBorrarE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRaiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMulti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbHexa)
                                    .addComponent(jrbDecimal, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbBinario, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLogaritmoNatural, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(btnLogaritmo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnCos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnPotencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnPotencia2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(btnTan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFraccion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSen, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrbBinario, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbHexa, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBorrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFraccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPotencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLogaritmo2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLogaritmoNatural, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPotencia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotencia2ActionPerformed
        valor1 = Double.parseDouble(txtDatos.getText());
        txtDatos.setText("");
        operacion = "potencia2";
    }//GEN-LAST:event_btnPotencia2ActionPerformed

    private void jrbDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDecimalActionPerformed
        jrbBinario.setSelected(false);
        jrbHexa.setSelected(false);
        
        btn0.setEnabled(true);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
    }//GEN-LAST:event_jrbDecimalActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        txtDatos.append("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        txtDatos.append("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        txtDatos.append("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
       txtDatos.append("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        txtDatos.append("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        txtDatos.append("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        txtDatos.append("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        txtDatos.append("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        txtDatos.append("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        txtDatos.append("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizActionPerformed
        txtDatos.setText(String.valueOf(Math.sqrt(Double.parseDouble(txtDatos.getText()))));
    }//GEN-LAST:event_btnRaizActionPerformed

    private void btnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosActionPerformed
        txtDatos.setText(String.valueOf(Math.cos(Math.toRadians(Double.parseDouble(txtDatos.getText())))));
    }//GEN-LAST:event_btnCosActionPerformed

    private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanActionPerformed
        txtDatos.setText(String.valueOf(Math.tan(Math.toRadians(Double.parseDouble(txtDatos.getText())))));
    }//GEN-LAST:event_btnTanActionPerformed

    private void btnSenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSenActionPerformed
        txtDatos.setText(String.valueOf(Math.sin(Math.toRadians(Double.parseDouble(txtDatos.getText())))));
    }//GEN-LAST:event_btnSenActionPerformed

    private void btnBorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTodoActionPerformed
        txtDatos.setText("");
    }//GEN-LAST:event_btnBorrarTodoActionPerformed

    private void btnBorrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarEActionPerformed
        String valor = txtDatos.getText();
        txtDatos.setText( valor.substring(0, valor.length()-1) );
    }//GEN-LAST:event_btnBorrarEActionPerformed

    private void btnAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorActionPerformed
        frmAcercaDe frm = new frmAcercaDe();
        frm.setVisible(true);
    }//GEN-LAST:event_btnAutorActionPerformed

    private void btnPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaActionPerformed
       txtDatos.setText(String.valueOf(Math.pow(Double.parseDouble(txtDatos.getText()),2)));
    }//GEN-LAST:event_btnPotenciaActionPerformed

    private void btnFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorialActionPerformed
        txtDatos.setText(String.valueOf(factorial(Integer.parseInt(txtDatos.getText()))));
    }//GEN-LAST:event_btnFactorialActionPerformed

    private void btnFraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFraccionActionPerformed
        txtDatos.setText(String.valueOf(1/Double.parseDouble(txtDatos.getText()) ) );
    }//GEN-LAST:event_btnFraccionActionPerformed

    private void btnLogaritmoNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogaritmoNaturalActionPerformed
        double valor,log;
        valor = Double.parseDouble(txtDatos.getText());
        log = Math.log(valor);
        txtDatos.setText(String.valueOf(log));
    }//GEN-LAST:event_btnLogaritmoNaturalActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        Double valor2 = Double.parseDouble(txtDatos.getText());
        switch(operacion)
        {
            case "suma":
                txtDatos.setText(String.valueOf(valor1+valor2));
                break;
            case "resta":
                txtDatos.setText(String.valueOf(valor1-valor2));
                break;
            case "multiplicacion":
                txtDatos.setText(String.valueOf(valor1*valor2));
                break;
            case "Division":
                if(valor2==0){
                    txtDatos.setText(String.valueOf("E"));
                } else{
                    txtDatos.setText(String.valueOf(valor1/valor2));
                }
                break;
            case "porcentaje":
                txtDatos.setText(String.valueOf(valor1*valor2));
                break;
            case "Potencia2":
                txtDatos.setText(String.valueOf(Math.pow(valor1,valor2)));
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        valor1 = Double.parseDouble(txtDatos.getText());
        txtDatos.setText("");
        operacion="suma";
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        valor1 = Double.parseDouble(txtDatos.getText());
        txtDatos.setText("");
        operacion="resta";
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        valor1 = Double.parseDouble(txtDatos.getText());
        txtDatos.setText("");
        operacion="multiplicacion";
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        valor1 = Double.parseDouble(txtDatos.getText());
        txtDatos.setText("");
        operacion="Division";
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentajeActionPerformed
        valor1 = Double.parseDouble(txtDatos.getText());
        txtDatos.setText("");
        operacion="porcentaje";
    }//GEN-LAST:event_btnPorcentajeActionPerformed

    private void btnLogaritmo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogaritmo2ActionPerformed
        double numero, log;
        numero = Double.parseDouble(txtDatos.getText());
        log = Math.log10(numero);
        txtDatos.setText(String.valueOf(log));        
    }//GEN-LAST:event_btnLogaritmo2ActionPerformed

    private void jrbBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbBinarioActionPerformed
        jrbDecimal.setSelected(false);
        jrbHexa.setSelected(false);
        txtDatos.setText(Integer.toBinaryString(Integer.parseInt(txtDatos.getText())));
    }//GEN-LAST:event_jrbBinarioActionPerformed

    private void jrbHexaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbHexaActionPerformed
        jrbDecimal.setSelected(false);
        jrbBinario.setSelected(false);
        txtDatos.setText(Integer.toHexString(Integer.parseInt(txtDatos.getText())));
    }//GEN-LAST:event_jrbHexaActionPerformed

 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAutor;
    private javax.swing.JButton btnBorrarE;
    private javax.swing.JButton btnBorrarTodo;
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnFactorial;
    private javax.swing.JButton btnFraccion;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLogaritmo2;
    private javax.swing.JButton btnLogaritmoNatural;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnPorcentaje;
    private javax.swing.JButton btnPotencia;
    private javax.swing.JButton btnPotencia2;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSen;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btnTan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrbBinario;
    private javax.swing.JRadioButton jrbDecimal;
    private javax.swing.JRadioButton jrbHexa;
    private javax.swing.JTextArea txtDatos;
    // End of variables declaration//GEN-END:variables
}
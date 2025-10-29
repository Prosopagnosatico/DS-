import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.util.List;

//Classe principal

//JFrame é uma classe que disponibiliza os métodos necessario para fazer uma janela, e essa classe ta herdando todas essas classe
class JanelaPrincipal extends JFrame {
    //O JTextField é uma classe é um tipo(que nem String) que faz essas variaveis campo virarem campos que da para escrever texto
    private JTextField campoNome, campoEmail, campoRua, campoCidade;
    //O JCombo faz um menu para tu colocar varias opções
    private JComboBox<String> comboCurso;
    //O JCheckBox faz uma caixinha opcional
    private JCheckBox checkEmail, checkNotificacao;
    //O JRadioButton faz tipo o JCheckBox, mas ao invés ser opcional, você só pode escolher e marca um e é obrigatorio marcar
    private JRadioButton radioMasc, radioFem;
    //Botões
    private JButton btnCadastrar, btnLimpar, btnSair;
    private JTable tabela;
    private DefaultTableModel modeloTabela;


    public JanelaPrincipal() {
        //setTitle tá definindo o texto do titulo na janela e o setSize o tamanho da janela
        setTitle("Sistema de Cadastro de Alunos");
        setSize(500, 400);
        //Faz o programa fechar e parar de rodar quando tu clica no x
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Centraliza a tela no meio, 0 right e 0 esquerda
        setLocationRelativeTo(null);

        //Menu

        //Header - menu em cima horizontal principal
        JMenuBar barra = new JMenuBar();
        //Menu do menu - vertical que desce do triangulo
        JMenu menuArquivo = new JMenu("Arquivo");
        //Quando tu clica no arquivo e quer sair tu clica aqui
        JMenuItem itemSair = new JMenuItem("Sair");
        //Quando tu clicar no item sair, isso será e(event) e isso encerra o programa com o System.exit 0
        itemSair.addActionListener(e -> System.exit(0));
        //Bota o item sair no menu arquivo
        menuArquivo.add(itemSair);

        JMenu menuAjuda = new JMenu("Ajuda");
        JMenuItem itemSobre = new JMenuItem("Sobre");
        itemSobre.addActionListener(e -> JOptionPane.showMessageDialog(this,
                "Sistema de Cadastro de Alunos \nVersão 1.0"));
        menuAjuda.add(itemSobre);

        barra.add(menuArquivo);
        barra.add(menuAjuda);
        setJMenuBar(barra);



        // Abas
        JTabbedPane abas = new JTabbedPane();

        // Painel Cadastro
        JPanel painelCadastro = new JPanel(new GridLayout(7,2));
        painelCadastro.add(new JLabel("Nome:"));
        campoNome = new JTextField(20);
        painelCadastro.add(campoNome);
        painelCadastro.add(new JLabel("Email:"));
        campoEmail = new JTextField(20);
        painelCadastro.add(campoEmail);
        painelCadastro.add(new JLabel("Curso:"));
        String[] cursos = {"Java", "Python", "C#", "JavaScript"};
        comboCurso = new JComboBox<>(cursos);
        painelCadastro.add(comboCurso);
        painelCadastro.add(new JLabel("Gênero:"));
        JPanel painelGenero = new JPanel();
        radioMasc = new JRadioButton("Masculino");
        radioFem = new JRadioButton("Feminino");
        ButtonGroup grupoGenero = new ButtonGroup();
        grupoGenero.add(radioMasc);
        grupoGenero.add(radioFem);
        painelGenero.add(radioMasc);
        painelGenero.add(radioFem);
        painelCadastro.add(painelGenero);
        checkEmail = new JCheckBox("Receber emails");
        checkNotificacao = new JCheckBox("Ativar notificações");
        painelCadastro.add(checkEmail);
        painelCadastro.add(checkNotificacao);
        painelCadastro.add(new JLabel("Rua:"));
        campoRua = new JTextField(20);
        painelCadastro.add(campoRua);
        painelCadastro.add(new JLabel("Cidade:"));
        campoCidade = new JTextField(20);
        painelCadastro.add(campoCidade);
        JPanel painelBotoes = new JPanel();
        btnCadastrar = new JButton("Cadastrar");
        btnLimpar = new JButton("Limpar");
        painelBotoes.add(btnCadastrar);
        painelBotoes.add(btnLimpar);
        JPanel painelCadastroCompleto = new JPanel(new BorderLayout());
        painelCadastroCompleto.add(painelCadastro, BorderLayout.CENTER);
        painelCadastroCompleto.add(painelBotoes, BorderLayout.SOUTH);
        abas.add("Cadastro", painelCadastroCompleto);


        // Painel Lista
        modeloTabela = new DefaultTableModel(new Object[]{"ID","Nome","Email","Curso","Cidade"},0);
        tabela = new JTable(modeloTabela);
        JButton btnAtualizar = new JButton("Atualizar");
        JButton btnExcluir = new JButton("Excluir");
        JPanel painelListaBotoes = new JPanel();
        painelListaBotoes.add(btnAtualizar);
        painelListaBotoes.add(btnExcluir);
        JPanel painelLista = new JPanel(new BorderLayout());
        painelLista.add(new JScrollPane(tabela), BorderLayout.CENTER);
        painelLista.add(painelListaBotoes, BorderLayout.SOUTH);
        abas.add("Lista de Alunos", painelLista);
        // Ações
        btnCadastrar.addActionListener(e -> cadastrarAluno());
        btnLimpar.addActionListener(e -> limparCampos());
        btnAtualizar.addActionListener(e -> atualizarAluno());
        btnExcluir.addActionListener(e -> excluirAluno());
        getContentPane().add(abas);
        carregarTabela();
        setVisible(true);
    }
    private void cadastrarAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome(campoNome.getText());
        aluno.setEmail(campoEmail.getText());
        aluno.setCurso((String) comboCurso.getSelectedItem());
        aluno.setGenero(radioMasc.isSelected() ? "Masculino" : "Feminino");
        aluno.setReceberEmail(checkEmail.isSelected());
        aluno.setReceberNotificacao(checkNotificacao.isSelected());
        aluno.setRua(campoRua.getText());
        aluno.setCidade(campoCidade.getText());
        new AlunoDAO().salvar(aluno);
        carregarTabela();
        limparCampos();
        JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!");
    }
    private void carregarTabela() {
        modeloTabela.setRowCount(0);
        List<Aluno> lista = new AlunoDAO().listar();
        for (Aluno a : lista) {
            modeloTabela.addRow(new Object[]{a.getId(), a.getNome(), a.getEmail(), a.getCurso(), a.getCidade()});
        }
    }
    private void atualizarAluno() {
        int linha = tabela.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um aluno para atualizar.");
            return;
        }
        int id = (int) tabela.getValueAt(linha, 0);
        String novoNome = JOptionPane.showInputDialog("Novo nome:", tabela.getValueAt(linha, 1));
        String novoEmail = JOptionPane.showInputDialog("Novo email:", tabela.getValueAt(linha, 2));
        Aluno aluno = new Aluno();
        aluno.setId(id);
        aluno.setNome(novoNome);
        aluno.setEmail(novoEmail);
        aluno.setCurso((String) tabela.getValueAt(linha, 3));
        aluno.setCidade((String) tabela.getValueAt(linha, 4));
        new AlunoDAO().atualizar(aluno);
        carregarTabela();
        JOptionPane.showMessageDialog(this, "Aluno atualizado com sucesso!");
    }
    private void excluirAluno() {
        int linha = tabela.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um aluno para excluir.");
            return;
        }
        int id = (int) tabela.getValueAt(linha, 0);
        new AlunoDAO().excluir(id);
        carregarTabela();
        JOptionPane.showMessageDialog(this, "Aluno excluído com sucesso!");
    }
    private void limparCampos() {
        campoNome.setText("");
        campoEmail.setText("");
        campoRua.setText("");
        campoCidade.setText("");
        comboCurso.setSelectedIndex(0);
        radioMasc.setSelected(false);
        radioFem.setSelected(false);
        checkEmail.setSelected(false);
        checkNotificacao.setSelected(false);
    }
    public static void main(String[] args) {
        new JanelaPrincipal();
    }
}

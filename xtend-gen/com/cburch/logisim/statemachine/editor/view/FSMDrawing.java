package com.cburch.logisim.statemachine.editor.view;

import com.cburch.logisim.statemachine.PrettyPrinter;
import com.cburch.logisim.statemachine.editor.view.DrawUtils;
import com.cburch.logisim.statemachine.editor.view.FSMCustomFactory;
import com.cburch.logisim.statemachine.fSMDSL.BoolExpr;
import com.cburch.logisim.statemachine.fSMDSL.Command;
import com.cburch.logisim.statemachine.fSMDSL.CommandList;
import com.cburch.logisim.statemachine.fSMDSL.FSM;
import com.cburch.logisim.statemachine.fSMDSL.FSMDSLFactory;
import com.cburch.logisim.statemachine.fSMDSL.FSMElement;
import com.cburch.logisim.statemachine.fSMDSL.InputPort;
import com.cburch.logisim.statemachine.fSMDSL.LayoutInfo;
import com.cburch.logisim.statemachine.fSMDSL.OutputPort;
import com.cburch.logisim.statemachine.fSMDSL.Port;
import com.cburch.logisim.statemachine.fSMDSL.State;
import com.cburch.logisim.statemachine.fSMDSL.Transition;
import com.google.common.base.Objects;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.QuadCurve2D;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class FSMDrawing {
  public final static int RADIUS = 30;
  
  public final static int CHAR_HEIGHT = 15;
  
  public final static int PORT_HEIGHT = 15;
  
  public final static int INPUT_X = 100;
  
  public final static int OUTPUT_X = 100;
  
  public final static int FSM_BORDER_X = 30;
  
  public final static int FSM_BORDER_Y = 30;
  
  public final static int FSM_TITLE_HEIGHT = 30;
  
  private final static boolean DEBUG = false;
  
  public void updateLayout(final FSMElement e, final int x, final int y, final int width, final int heigh) {
    LayoutInfo _layout = e.getLayout();
    _layout.setX(x);
    LayoutInfo _layout_1 = e.getLayout();
    _layout_1.setY(y);
    LayoutInfo _layout_2 = e.getLayout();
    _layout_2.setWidth(width);
    LayoutInfo _layout_3 = e.getLayout();
    _layout_3.setHeight(heigh);
  }
  
  public LayoutInfo checkLayout(final FSMElement e) {
    LayoutInfo _xblockexpression = null;
    {
      LayoutInfo _layout = e.getLayout();
      boolean _equals = Objects.equal(_layout, null);
      if (_equals) {
        LayoutInfo _createLayoutInfo = FSMDSLFactory.eINSTANCE.createLayoutInfo();
        e.setLayout(_createLayoutInfo);
      }
      _xblockexpression = e.getLayout();
    }
    return _xblockexpression;
  }
  
  protected Object _drawElement(final FSMElement e, final Graphics2D page, final List<FSMElement> selection) {
    return null;
  }
  
  public void computeCommandBoxWidth(final CommandList e, final Graphics2D g) {
    LayoutInfo l = e.getLayout();
    int w = FSMCustomFactory.CMD_WIDTH;
    EList<Command> _commands = e.getCommands();
    for (final Command c : _commands) {
      FontMetrics _fontMetrics = g.getFontMetrics();
      String _pp = PrettyPrinter.pp(c);
      int _stringWidth = _fontMetrics.stringWidth(_pp);
      int _max = Math.max(w, _stringWidth);
      w = _max;
    }
    l.setWidth(w);
  }
  
  public Pair<Integer, Integer> updateBoundingBox(final CommandList e, final Graphics2D g) {
    Pair<Integer, Integer> _xblockexpression = null;
    {
      LayoutInfo l = e.getLayout();
      FontMetrics _fontMetrics = g.getFontMetrics();
      final int lineHeight = _fontMetrics.getHeight();
      EList<Command> _commands = e.getCommands();
      final int nbCommands = _commands.size();
      int height = Math.max(FSMCustomFactory.CMD_HEIGHT, (6 + (lineHeight * nbCommands)));
      int width = FSMCustomFactory.CMD_WIDTH;
      EList<Command> _commands_1 = e.getCommands();
      for (final Command c : _commands_1) {
        FontMetrics _fontMetrics_1 = g.getFontMetrics();
        String _pp = PrettyPrinter.pp(c);
        int _stringWidth = _fontMetrics_1.stringWidth(_pp);
        int _plus = (8 + _stringWidth);
        int _max = Math.max(width, _plus);
        width = _max;
      }
      _xblockexpression = new Pair<Integer, Integer>(Integer.valueOf(width), Integer.valueOf(height));
    }
    return _xblockexpression;
  }
  
  protected Object _drawElement(final CommandList e, final Graphics2D g, final List<FSMElement> selection) {
    this.highlightSelection(e, g, selection);
    this.checkLayout(e);
    LayoutInfo l = e.getLayout();
    final Pair<Integer, Integer> box = this.updateBoundingBox(e, g);
    final int newW = (box.getKey()).intValue();
    final int newH = (box.getValue()).intValue();
    Integer _key = box.getKey();
    int _height = l.getHeight();
    boolean _notEquals = ((_key).intValue() != _height);
    if (_notEquals) {
      int _x = l.getX();
      int _height_1 = l.getHeight();
      int _plus = (_x + _height_1);
      l.setX(_plus);
      l.setHeight(newH);
      int _x_1 = l.getX();
      int _height_2 = l.getHeight();
      int _minus = (_x_1 - _height_2);
      l.setX(_minus);
      l.setWidth(newW);
    }
    FontMetrics _fontMetrics = g.getFontMetrics();
    final int lineHeight = _fontMetrics.getHeight();
    g.setColor(Color.white);
    int _x_2 = l.getX();
    int _y = l.getY();
    int _width = l.getWidth();
    int _height_3 = l.getHeight();
    g.fillRoundRect(_x_2, _y, _width, _height_3, 5, 5);
    g.setColor(Color.black);
    int _x_3 = l.getX();
    int _y_1 = l.getY();
    int _width_1 = l.getWidth();
    int _height_4 = l.getHeight();
    g.drawRoundRect(_x_3, _y_1, _width_1, _height_4, 5, 5);
    int line = 1;
    EList<Command> _commands = e.getCommands();
    for (final Command c : _commands) {
      {
        String _pp = PrettyPrinter.pp(c);
        int _x_4 = l.getX();
        int _plus_1 = (_x_4 + 4);
        int _y_2 = l.getY();
        int _plus_2 = (_y_2 + (line * lineHeight));
        int _plus_3 = (_plus_2 + 1);
        g.drawString(_pp, _plus_1, _plus_3);
        line++;
      }
    }
    LayoutInfo _layout = e.getLayout();
    this.showZone(_layout, g);
    return null;
  }
  
  protected Object _drawElement(final FSM e, final Graphics2D g, final List<FSMElement> selection) {
    this.highlightSelection(e, g, selection);
    final LayoutInfo l = e.getLayout();
    int _x = l.getX();
    boolean _equals = (_x == 0);
    if (_equals) {
      l.setX(FSMDrawing.FSM_BORDER_X);
    }
    int _y = l.getY();
    boolean _equals_1 = (_y == 0);
    if (_equals_1) {
      l.setY(FSMDrawing.FSM_BORDER_Y);
    }
    int _width = l.getWidth();
    boolean _equals_2 = (_width == 0);
    if (_equals_2) {
      l.setWidth(FSMCustomFactory.FSM_WIDTH);
    }
    int _height = l.getHeight();
    boolean _equals_3 = (_height == 0);
    if (_equals_3) {
      l.setHeight(FSMCustomFactory.FSM_HEIGHT);
    }
    FontMetrics _fontMetrics = g.getFontMetrics();
    final int lineHeight = _fontMetrics.getHeight();
    int _width_1 = e.getWidth();
    String _plus = (Integer.valueOf(_width_1) + "-bit FSM : ");
    String _name = e.getName();
    String _plus_1 = (_plus + _name);
    final String label = (_plus_1 + " ");
    FontMetrics _fontMetrics_1 = g.getFontMetrics();
    final int lblWidth = _fontMetrics_1.stringWidth(label);
    int _x_1 = l.getX();
    int _y_1 = l.getY();
    int _width_2 = l.getWidth();
    int _height_1 = l.getHeight();
    g.drawRoundRect(_x_1, _y_1, _width_2, _height_1, 15, 15);
    int _x_2 = l.getX();
    int _width_3 = l.getWidth();
    int _divide = (_width_3 / 2);
    int _plus_2 = (_x_2 + _divide);
    int _minus = (_plus_2 - (lblWidth / 2));
    int _y_2 = l.getY();
    int _plus_3 = (_y_2 + ((FSMDrawing.FSM_TITLE_HEIGHT + lineHeight) / 2));
    g.drawString(label, _minus, _plus_3);
    int _x_3 = l.getX();
    int _y_3 = l.getY();
    int _plus_4 = (_y_3 + FSMDrawing.FSM_TITLE_HEIGHT);
    int _x_4 = l.getX();
    int _width_4 = l.getWidth();
    int _plus_5 = (_x_4 + _width_4);
    int _y_4 = l.getY();
    int _plus_6 = (_y_4 + FSMDrawing.FSM_TITLE_HEIGHT);
    g.drawLine(_x_3, _plus_4, _plus_5, _plus_6);
    EList<Port> _in = e.getIn();
    for (final Port p : _in) {
      this.drawElement(p, g, selection);
    }
    EList<Port> _out = e.getOut();
    for (final Port p_1 : _out) {
      this.drawElement(p_1, g, selection);
    }
    EList<State> _states = e.getStates();
    for (final State s : _states) {
      EList<Transition> _transition = s.getTransition();
      for (final Transition t : _transition) {
        this.drawElement(t, g, selection);
      }
    }
    EList<State> _states_1 = e.getStates();
    for (final State s_1 : _states_1) {
      this.drawElement(s_1, g, selection);
    }
    EList<State> _states_2 = e.getStates();
    for (final State s_2 : _states_2) {
      CommandList _commandList = s_2.getCommandList();
      this.drawElement(_commandList, g, selection);
    }
    return null;
  }
  
  protected Object _drawElement(final State e, final Graphics2D g, final List<FSMElement> selection) {
    this.highlightSelection(e, g, selection);
    final LayoutInfo l = e.getLayout();
    int _width = l.getWidth();
    boolean _equals = (_width == 0);
    if (_equals) {
      l.setWidth(FSMCustomFactory.STATE_RADIUS);
      l.setHeight(FSMCustomFactory.STATE_RADIUS);
    }
    final int radius = l.getWidth();
    g.setColor(Color.white);
    int _x = l.getX();
    int _y = l.getY();
    g.fillOval(_x, _y, (2 * radius), (2 * radius));
    g.setColor(Color.black);
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    FontMetrics _fontMetrics = g.getFontMetrics();
    String _name = e.getName();
    int labelWidth = _fontMetrics.stringWidth(_name);
    String _name_1 = e.getName();
    int _x_1 = l.getX();
    int _plus = (_x_1 + radius);
    int _minus = (_plus - (labelWidth / 2));
    int _y_1 = l.getY();
    int _plus_1 = (_y_1 + radius);
    int _minus_1 = (_plus_1 - 3);
    g.drawString(_name_1, _minus, _minus_1);
    FontMetrics _fontMetrics_1 = g.getFontMetrics();
    String _code = e.getCode();
    int _stringWidth = _fontMetrics_1.stringWidth(_code);
    labelWidth = _stringWidth;
    String _code_1 = e.getCode();
    int _x_2 = l.getX();
    int _plus_2 = (_x_2 + radius);
    int _minus_2 = (_plus_2 - (labelWidth / 2));
    int _y_2 = l.getY();
    int _plus_3 = (_y_2 + radius);
    int _plus_4 = (_plus_3 + 13);
    g.drawString(_code_1, _minus_2, _plus_4);
    int _x_3 = l.getX();
    int _y_3 = l.getY();
    g.drawOval(_x_3, _y_3, (2 * radius), (2 * radius));
    boolean _and = false;
    EObject _eContainer = e.eContainer();
    boolean _notEquals = (!Objects.equal(_eContainer, null));
    if (!_notEquals) {
      _and = false;
    } else {
      EObject _eContainer_1 = e.eContainer();
      _and = (_eContainer_1 instanceof FSM);
    }
    if (_and) {
      EObject _eContainer_2 = e.eContainer();
      final FSM fsm = ((FSM) _eContainer_2);
      State _start = fsm.getStart();
      boolean _equals_1 = Objects.equal(_start, e);
      if (_equals_1) {
        int _x_4 = l.getX();
        int _minus_3 = (_x_4 - 3);
        int _y_4 = l.getY();
        int _minus_4 = (_y_4 - 3);
        g.drawOval(_minus_3, _minus_4, ((2 * radius) + 6), ((2 * radius) + 6));
      }
    }
    return null;
  }
  
  public void highlightSelection(final FSMElement e, final Graphics2D g, final List<FSMElement> selection) {
    boolean _contains = selection.contains(e);
    if (_contains) {
      BasicStroke _basicStroke = new BasicStroke(3);
      g.setStroke(_basicStroke);
    } else {
      BasicStroke _basicStroke_1 = new BasicStroke(1);
      g.setStroke(_basicStroke_1);
    }
  }
  
  public Point shift(final int dx, final int dy, final int radius) {
    Point _xblockexpression = null;
    {
      Point p = null;
      if ((dx != 0)) {
        double _abs = Math.abs((((double) dy) / ((double) dx)));
        final double angle = Math.atan(_abs);
        double _cos = Math.cos(angle);
        double _multiply = (radius * _cos);
        int cosx = ((int) _multiply);
        double _sin = Math.sin(angle);
        double _multiply_1 = (radius * _sin);
        int cosy = ((int) _multiply_1);
        if ((dy < 0)) {
          cosy = (-cosy);
        }
        if ((dx < 0)) {
          cosx = (-cosx);
        }
        Point _point = new Point(cosx, cosy);
        p = _point;
      } else {
        if ((dy > 0)) {
          Point _point_1 = new Point(0, radius);
          p = _point_1;
        } else {
          Point _point_2 = new Point(0, (-radius));
          p = _point_2;
        }
      }
      _xblockexpression = p;
    }
    return _xblockexpression;
  }
  
  protected Object _drawElement(final Transition e, final Graphics2D g, final List<FSMElement> selection) {
    this.highlightSelection(e, g, selection);
    EObject _eContainer = e.eContainer();
    final State src = ((State) _eContainer);
    State _src = e.getSrc();
    boolean _notEquals = (!Objects.equal(src, _src));
    if (_notEquals) {
      e.setSrc(src);
    }
    final LayoutInfo sl = src.getLayout();
    final LayoutInfo l = e.getLayout();
    final int radius = sl.getWidth();
    int _x = l.getX();
    int _x_1 = sl.getX();
    int _minus = (_x - _x_1);
    int _minus_1 = (_minus - radius);
    int _y = l.getY();
    int _y_1 = sl.getY();
    int _minus_2 = (_y - _y_1);
    int _minus_3 = (_minus_2 - radius);
    final Point _s = this.shift(_minus_1, _minus_3, radius);
    int _x_2 = sl.getX();
    int _plus = (_x_2 + radius);
    final int srcx = (_plus + _s.x);
    int _y_2 = sl.getY();
    int _plus_1 = (_y_2 + radius);
    final int srcy = (_plus_1 + _s.y);
    State _dst = e.getDst();
    boolean _notEquals_1 = (!Objects.equal(_dst, null));
    if (_notEquals_1) {
      g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      BoolExpr _predicate = e.getPredicate();
      final String pp = PrettyPrinter.pp(_predicate);
      FontMetrics _fontMetrics = g.getFontMetrics();
      int _height = _fontMetrics.getHeight();
      final int ph = (_height + 6);
      FontMetrics _fontMetrics_1 = g.getFontMetrics();
      int _stringWidth = _fontMetrics_1.stringWidth(pp);
      final int pw = (_stringWidth + 6);
      g.setColor(Color.GRAY);
      int _x_3 = l.getX();
      int _y_3 = l.getY();
      g.drawRect(_x_3, _y_3, pw, ph);
      l.setWidth(pw);
      l.setHeight(ph);
      g.setColor(Color.BLACK);
      int _x_4 = l.getX();
      int _plus_2 = (_x_4 + 3);
      int _y_4 = l.getY();
      int _plus_3 = (_y_4 + ph);
      int _minus_4 = (_plus_3 - 3);
      g.drawString(pp, _plus_2, _minus_4);
      State _dst_1 = e.getDst();
      final LayoutInfo dl = _dst_1.getLayout();
      int _x_5 = dl.getX();
      int _x_6 = l.getX();
      int _minus_5 = (_x_5 - _x_6);
      int _plus_4 = (_minus_5 + radius);
      int _y_5 = dl.getY();
      int _y_6 = l.getY();
      int _minus_6 = (_y_5 - _y_6);
      int _plus_5 = (_minus_6 + radius);
      final Point _d = this.shift(_plus_4, _plus_5, radius);
      int _x_7 = dl.getX();
      int _plus_6 = (_x_7 + radius);
      final int dstx = (_plus_6 - _d.x);
      int _y_7 = dl.getY();
      int _plus_7 = (_y_7 + radius);
      final int dsty = (_plus_7 - _d.y);
      int _x_8 = l.getX();
      int _y_8 = l.getY();
      DrawUtils.drawArrowLine(g, _x_8, _y_8, dstx, dsty, 8, 8, true);
      int _x_9 = l.getX();
      int _y_9 = l.getY();
      final QuadCurve2D.Double quadCurve = new QuadCurve2D.Double(srcx, srcy, _x_9, _y_9, dstx, dsty);
      g.draw(quadCurve);
    } else {
      int _x_10 = l.getX();
      int _y_10 = l.getY();
      g.drawLine(srcx, srcy, _x_10, _y_10);
    }
    LayoutInfo _layout = e.getLayout();
    this.showZone(_layout, g);
    return null;
  }
  
  public void showZone(final LayoutInfo l, final Graphics2D g) {
    if (FSMDrawing.DEBUG) {
      g.setColor(Color.GREEN);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("[");
      int _x = l.getX();
      _builder.append(_x, "");
      _builder.append(",");
      int _y = l.getY();
      _builder.append(_y, "");
      _builder.append("-");
      int _x_1 = l.getX();
      int _width = l.getWidth();
      int _plus = (_x_1 + _width);
      _builder.append(_plus, "");
      _builder.append(",");
      int _y_1 = l.getY();
      int _height = l.getHeight();
      int _plus_1 = (_y_1 + _height);
      _builder.append(_plus_1, "");
      _builder.append("]");
      int _x_2 = l.getX();
      int _y_2 = l.getY();
      int _minus = (_y_2 - 8);
      g.drawString(_builder.toString(), _x_2, _minus);
      int _x_3 = l.getX();
      int _y_3 = l.getY();
      int _width_1 = l.getWidth();
      int _height_1 = l.getHeight();
      g.drawRect(_x_3, _y_3, _width_1, _height_1);
      g.setColor(Color.black);
    }
  }
  
  protected Object _drawElement(final InputPort e, final Graphics2D page, final List<FSMElement> selection) {
    this.highlightSelection(e, page, selection);
    this.drawPort(e, page, true);
    return null;
  }
  
  public void drawPort(final Port e, final Graphics2D page, final boolean left) {
    final LayoutInfo l = e.getLayout();
    EObject _eContainer = e.eContainer();
    final LayoutInfo fsmLayout = ((FSM) _eContainer).getLayout();
    String label = e.getName();
    int _width = e.getWidth();
    boolean _greaterThan = (_width > 1);
    if (_greaterThan) {
      String _label = label;
      int _width_1 = e.getWidth();
      int _minus = (_width_1 - 1);
      String _plus = ("[" + Integer.valueOf(_minus));
      String _plus_1 = (_plus + ":0]");
      label = (_label + _plus_1);
    }
    FontMetrics _fontMetrics = page.getFontMetrics();
    int _stringWidth = _fontMetrics.stringWidth(label);
    int _plus_2 = (6 + _stringWidth);
    l.setWidth(_plus_2);
    if (left) {
      EObject _eContainer_1 = e.eContainer();
      LayoutInfo _layout = ((FSM) _eContainer_1).getLayout();
      int _x = _layout.getX();
      l.setX(_x);
      l.setHeight(FSMDrawing.PORT_HEIGHT);
      int _x_1 = l.getX();
      int _y = l.getY();
      int _width_2 = l.getWidth();
      int _height = l.getHeight();
      int _plus_3 = (_height + 4);
      page.drawRect(_x_1, _y, _width_2, _plus_3);
      int _x_2 = l.getX();
      int _plus_4 = (_x_2 + 3);
      int _y_1 = l.getY();
      int _height_1 = l.getHeight();
      int _plus_5 = (_y_1 + _height_1);
      page.drawString(label, _plus_4, _plus_5);
      int _x_3 = l.getX();
      int _minus_1 = (_x_3 - (FSMDrawing.INPUT_X / 2));
      int _y_2 = l.getY();
      int _plus_6 = (_y_2 + (FSMDrawing.PORT_HEIGHT / 2));
      int _x_4 = l.getX();
      int _y_3 = l.getY();
      int _plus_7 = (_y_3 + (FSMDrawing.PORT_HEIGHT / 2));
      DrawUtils.drawArrowLine(page, _minus_1, _plus_6, _x_4, _plus_7, 8, 8, false);
    } else {
      int _x_5 = fsmLayout.getX();
      int _width_3 = fsmLayout.getWidth();
      int _plus_8 = (_x_5 + _width_3);
      int _width_4 = l.getWidth();
      int _minus_2 = (_plus_8 - _width_4);
      l.setX(_minus_2);
      l.setHeight(FSMDrawing.PORT_HEIGHT);
      int _x_6 = l.getX();
      int _y_4 = l.getY();
      int _width_5 = l.getWidth();
      int _height_2 = l.getHeight();
      int _plus_9 = (_height_2 + 4);
      page.drawRect(_x_6, _y_4, _width_5, _plus_9);
      int _x_7 = l.getX();
      int _plus_10 = (_x_7 + 3);
      int _y_5 = l.getY();
      int _height_3 = l.getHeight();
      int _plus_11 = (_y_5 + _height_3);
      page.drawString(label, _plus_10, _plus_11);
      int _x_8 = l.getX();
      int _width_6 = l.getWidth();
      int _plus_12 = (_x_8 + _width_6);
      int _y_6 = l.getY();
      int _plus_13 = (_y_6 + (FSMDrawing.PORT_HEIGHT / 2));
      int _x_9 = l.getX();
      int _width_7 = l.getWidth();
      int _plus_14 = (_x_9 + _width_7);
      int _plus_15 = (_plus_14 + (FSMDrawing.INPUT_X / 2));
      int _y_7 = l.getY();
      int _plus_16 = (_y_7 + (FSMDrawing.PORT_HEIGHT / 2));
      DrawUtils.drawArrowLine(page, _plus_12, _plus_13, _plus_15, _plus_16, 8, 8, false);
    }
  }
  
  protected Object _drawElement(final OutputPort e, final Graphics2D page, final List<FSMElement> selection) {
    this.highlightSelection(e, page, selection);
    LayoutInfo _layout = e.getLayout();
    this.showZone(_layout, page);
    this.drawPort(e, page, false);
    return null;
  }
  
  public Object drawElement(final FSMElement e, final Graphics2D page, final List<FSMElement> selection) {
    if (e instanceof InputPort) {
      return _drawElement((InputPort)e, page, selection);
    } else if (e instanceof OutputPort) {
      return _drawElement((OutputPort)e, page, selection);
    } else if (e instanceof CommandList) {
      return _drawElement((CommandList)e, page, selection);
    } else if (e instanceof FSM) {
      return _drawElement((FSM)e, page, selection);
    } else if (e instanceof State) {
      return _drawElement((State)e, page, selection);
    } else if (e instanceof Transition) {
      return _drawElement((Transition)e, page, selection);
    } else if (e != null) {
      return _drawElement(e, page, selection);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e, page, selection).toString());
    }
  }
}

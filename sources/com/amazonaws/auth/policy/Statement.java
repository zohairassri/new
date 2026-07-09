package com.amazonaws.auth.policy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class Statement {
    private Effect effect;
    private List<Resource> resources;
    private List<Principal> principals = new ArrayList();
    private List<Action> actions = new ArrayList();
    private List<Condition> conditions = new ArrayList();

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f18398id = null;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum Effect {
        Allow,
        Deny
    }

    public Statement(Effect effect) {
        this.effect = effect;
    }

    public List<Action> getActions() {
        return this.actions;
    }

    public List<Condition> getConditions() {
        return this.conditions;
    }

    public Effect getEffect() {
        return this.effect;
    }

    public String getId() {
        return this.f18398id;
    }

    public List<Principal> getPrincipals() {
        return this.principals;
    }

    public List<Resource> getResources() {
        return this.resources;
    }

    public void setActions(Collection<Action> collection) {
        this.actions = new ArrayList(collection);
    }

    public void setConditions(List<Condition> list) {
        this.conditions = list;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    public void setId(String str) {
        this.f18398id = str;
    }

    public void setPrincipals(Collection<Principal> collection) {
        this.principals = new ArrayList(collection);
    }

    public void setResources(Collection<Resource> collection) {
        this.resources = new ArrayList(collection);
    }

    public Statement withActions(Action... actionArr) {
        setActions(Arrays.asList(actionArr));
        return this;
    }

    public Statement withConditions(Condition... conditionArr) {
        setConditions(Arrays.asList(conditionArr));
        return this;
    }

    public Statement withId(String str) {
        setId(str);
        return this;
    }

    public Statement withPrincipals(Principal... principalArr) {
        setPrincipals(principalArr);
        return this;
    }

    public Statement withResources(Resource... resourceArr) {
        setResources(Arrays.asList(resourceArr));
        return this;
    }

    public void setPrincipals(Principal... principalArr) {
        setPrincipals(new ArrayList(Arrays.asList(principalArr)));
    }
}

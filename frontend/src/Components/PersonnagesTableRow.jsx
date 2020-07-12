import React, { Component } from 'react';
import { Link } from 'react-router-dom';
import Button from 'react-bootstrap/Button';

export default class PersonnagesTableRow extends Component {


    render() {
        if(this.props.obj.idClasse == 1){
            this.props.obj.idClasse = "Voleur";
        }
        return (
            <tr>
                <td>{this.props.obj.name}</td>
                <td>{this.props.obj.hp}</td>
                <td>{this.props.obj.xp}</td>
                <td>{this.props.obj.fuite}</td>
                <td>{this.props.obj.idRace}</td>
                <td>{this.props.obj.idClasse}</td>
            </tr>
        );
    }
}